package training.java13;

import java.util.Objects;

public class ClassLoaderHierarchy {

    public static void main(String[] args) {
        // Bootstrap
        System.out.println("class loader for String: "
                + java.lang.String.class.getClassLoader());
// Platform
        System.out.println("class loader for DataSource: "
                + javax.sql.DataSource.class
                .getClassLoader());
// Application
        System.out.println("class loader for this class: "
                + ClassLoaderHierarchy.class.getClassLoader());

        ModuleLayer layer = ModuleLayer.boot();
        layer.modules().forEach(module -> {
            var classLoader = module.getClassLoader();
            var classLoaderName = Objects.isNull(classLoader) ? "bootstrap" : classLoader.getName();
            System.out.println(classLoaderName + ": " + module.getName());
        });
    }
}

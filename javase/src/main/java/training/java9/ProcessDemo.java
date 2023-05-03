package training.java9;

public class ProcessDemo {

    public static void main(String[] args) {
        ProcessHandle.allProcesses()
                // .forEach(handle -> System.out.println("%d - %s".formatted(handle.pid(), handle.info().command() )));
                .filter(handle -> handle.info().command().isPresent())
                .filter(handle -> handle.info().command().get().contains("chrome"))
                //.forEach(handle -> System.out.println("%d - %s".formatted(handle.pid(), handle.info().command() )));
                .forEach(handle -> handle.destroy());
    }
}

package training.java9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeRepository {

    public Optional<String> findNameById(int id) {
        return Optional.of("John");
//        return Optional.empty();
    }

    // 1, 2, 3, 4, 5
    // 1 - John
    // 3 - Jane
    // 5 - Jack
    // John, Jane, Jack
    public List<String> findNamesByIds(List<Integer> ids) {
//        List<String> names = new ArrayList<>();
//        for (int id: ids) {
//            Optional<String> name = findNameById(id);
//            if (name.isPresent()) {
//                names.add(name.get());
//            }
//        }
//        return names;

//        return ids.stream()
//                .map(id -> findNameById(id))
//                .filter(o -> o.isPresent())
//                .map(o -> o.get())
//                .collect(Collectors.toList());

//        return ids.stream()
//                .flatMap(id -> {
//                    Optional<String> result = findNameById(id);
//                    return result.stream();
//                })
//                .toList();

        return ids.stream()
                .map(this::findNameById)
                .flatMap(Optional::stream)
                .toList();

        // Elvis operator
//        Employee employee = new Employee();
//      String name = employee?:name;
//        String name = employee == null ? null : employee.getName();
//        String name = Stream.ofNullable(employee)
//                .map(Employee::getName).findFirst().orElse(null);

    }
}

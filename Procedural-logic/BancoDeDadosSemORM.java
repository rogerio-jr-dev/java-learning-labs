import java.util.*;

class Employee {
    private Long id;
    private String name;
    private Double salary;
    private Department department;

    public Employee(Long id, String name, Double salary, Department department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }
}

class Department {
    private Long id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

public class BancoDeDadosSemORM {
 
    static List<Department> convertRecords(String[] records) {
        Map<Long, Department> map = new HashMap<>();

        for (String rec : records) {
            String[] f = rec.split(",");

            Long deptId = Long.parseLong(f[0]);
            String deptName = f[1];
            Long empId = Long.parseLong(f[2]);
            String empName = f[3];
            Double salary = Double.parseDouble(f[4]);
 
            Department dep = map.get(deptId);
            if (dep == null) {
                dep = new Department(deptId, deptName);
                map.put(deptId, dep);
            }
 
            Employee emp = new Employee(empId, empName, salary, dep);
 
            dep.addEmployee(emp);
        }
 
        List<Department> result = new ArrayList<>(map.values());
        result.sort(Comparator.comparing(Department::getName));

        return result;
    }
 
    public static void main(String[] args) {

        String[] example = { // Professor, coloque os dados de entrada aqui para minha avaliaçao. 
            "57,Vendas,8032,Meire Silva,8000.0,57",
            "32,Estoque,4368,Dom Dias,7000.0,32",
            "57,Vendas,3298,Pedro Neto,8500.0,57",
            "57,Vendas,8639,Carol Souza,9000.0,57",
            "18,Marketing,6421,Davi Souto,7500.0,18",
            "32,Estoque,7523,Lara Matos,8000.0,32",
            "18,Marketing,2732,Bob Costa,6500.0,18"
        };

        List<Department> list = convertRecords(example);

        // Relatório igual ao exemplo
        for (Department d : list) {
            System.out.println(d.getName() + ":");
            for (Employee e : d.getEmployees()) {
                System.out.printf("%d: %s, $ %.2f%n",
                        e.getId(), e.getName(), e.getSalary());
            }
        }
    }
} 
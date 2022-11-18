package devsuperior.entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private Integer payDay;

    private List<Employee> employees = new ArrayList<>();
    private Andress andress;

    public Department() {
    }

    public Department(String name, Integer payDay, Andress andress) {
        this.name = name;
        this.payDay = payDay;
        this.andress = andress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPayDay() {
        return payDay;
    }

    public void setPayDay(Integer payDay) {
        this.payDay = payDay;
    }

    public Andress getAndress() {
        return andress;
    }

    public void setAndress(Andress andress) {
        this.andress = andress;
    }

    public void addEmployee(Employee employees){
        this.employees.add(employees);
    }

    public void removeEmployee(){
        this.employees.remove(employees);
    }

    public double payRoll(){
        double sum = 0;
        for (Employee emp : employees ) {
            sum += emp.getSalary();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FOLHA DE PAGAMENTO: \n");
        sb.append("Departamento " + name + "= R$ " + String.format("%.2f", payRoll() + "\n"));
        sb.append("Pagamento realizado no dia ");
        sb.append(payDay + "\n");
        sb.append("Funcionários: \n");
        for (Employee emp : employees) {
            sb.append(emp.getName() + "\n");
        }
        sb.append("Para dúvidas favor entrar em contato: ");
        sb.append(andress.getEmail());

        return sb.toString();
    }
}

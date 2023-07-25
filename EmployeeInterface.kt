
public interface EmployeeInterface {

    public abstract fun addEmp(name: kotlin.String, salary: kotlin.Double, check: (kotlin.String) -> kotlin.Unit): kotlin.Unit

    public abstract fun checkEmpAvailability(name: kotlin.String): kotlin.Unit

    public abstract fun deleteEmp(name: kotlin.String, check: (kotlin.String) -> kotlin.Unit): kotlin.Unit

    public abstract fun empPromotion(name: kotlin.String, newSalary: kotlin.Double, check: (kotlin.String) -> kotlin.Unit): kotlin.Unit

    public abstract fun getEmpSalary(name: kotlin.String, check: (kotlin.String) -> kotlin.Unit): kotlin.Unit

    public abstract fun reportOfEmp(): kotlin.Unit
}


interface EmployeeInterface {

    fun addEmp(name: String, salary: Double, check: (String) -> Unit)

    fun deleteEmp(name: String, check: (String) -> Unit)

    fun getEmpSalary(name: String, check: (String) -> Unit)

    fun empPromotion(name: String, newSalary: Double, check: (String) -> Unit)

    fun reportOfEmp()

    fun checkEmpAvailability(name: String)
}

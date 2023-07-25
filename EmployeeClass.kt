class EmployeeClass() : EmployeeInterface  {

    private val empSalary: MutableMap<String, Double> = mutableMapOf()

     override fun addEmp(name: String, salary: Double, check: (String) -> Unit) {
         check(name)
        if (empSalary[name] == null)
            empSalary[name] = salary
    }

     override fun deleteEmp(name: String, check: (String) -> Unit){
         check(name)
        if (empSalary[name] != null)
            empSalary.remove(name)

    }

     override fun getEmpSalary(name: String, check:(String)->Unit) {
         check(name)
         if (empSalary[name] != null) {
            val salary = empSalary[name]
            println("$name salary is $salary")
        }
    }

     override fun empPromotion(name : String, newSalary : Double, check: (String) -> Unit){
         check(name)
        if (empSalary[name]!=null){
            println("$name salary now increase by +${ newSalary - empSalary[name]!!} ")
            empSalary.replace(name , newSalary)
        }
    }

     override fun reportOfEmp() {
        println("employee report......")
        empSalary.forEach { (name, salary) ->
            println("Name : $name , Salary : $salary")
        }

    }
    override fun checkEmpAvailability(name :String){
        if (empSalary[name]==null)
            println("this emp doesn't exist")
    }

}

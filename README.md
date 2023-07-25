# desc
The simple Employee Management System allows you to add new employees with their respective salaries, delete employees, give promotions, and generate a report of all employees and their salaries. The main aim of this code is to practice using Kotlin Map data structure.

# EmployeeInterface 
<pre>
interface EmployeeInterface {

    fun addEmp(name: String, salary: Double)

    fun deleteEmp(name: String, check: (String) -> Unit)

    fun getEmpSalary(name: String, check: (String) -> Unit)

    fun empPromotion(name: String, newSalary: Double, check: (String) -> Unit)

    fun reportOfEmp()

    fun checkEmpAvailability(name: String)
}
</pre>

# EmployeeClass 
<pre>
class EmployeeClass() : EmployeeInterface  {

    private val empSalary: MutableMap<String, Double> = mutableMapOf()

     override fun addEmp(name: String, salary: Double) {

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

</pre>

# Main Fun 
<pre>
fun main(args: Array<String>) {

    val empClass = EmployeeClass()
    with(empClass) {
        addEmp("ahmed", 15000.0)
        addEmp("mohamed", 8750.40)
        addEmp("samy", 19633.8)
        addEmp("omar", 155540.0)
        reportOfEmp()
        empPromotion("samy", 25000.0, ::checkEmpAvailability)
        getEmpSalary("samy", ::checkEmpAvailability)
        deleteEmp("ahmed", ::checkEmpAvailability)
        getEmpSalary("ahmed", ::checkEmpAvailability)
        reportOfEmp()

    }

}
</pre>

# OutPut 
<pre>
employee report......
Name : ahmed , Salary : 15000.0
Name : mohamed , Salary : 8750.4
Name : samy , Salary : 19633.8
Name : omar , Salary : 155540.0
samy salary now increase by +5366.200000000001 
samy salary is 25000.0
this emp doesn't exist
employee report......
Name : mohamed , Salary : 8750.4
Name : samy , Salary : 25000.0
Name : omar , Salary : 155540.0
</pre>

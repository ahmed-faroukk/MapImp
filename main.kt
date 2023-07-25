fun main(args: Array<String>) {

    val empClass = EmployeeClass()
    with(empClass) {
        addEmp("ahmed", 15000.0, ::checkEmpAvailability)
        addEmp("mohamed", 8750.40, ::checkEmpAvailability)
        addEmp("samy", 19633.89, ::checkEmpAvailability)
        addEmp("omar", 155540.0, ::checkEmpAvailability)
        addEmp("omar", 155540.0, ::checkEmpAvailability)
        reportOfEmp()
        empPromotion("samy", 25000.0, ::checkEmpAvailability)
        getEmpSalary("samy", ::checkEmpAvailability)
        deleteEmp("ahmed", ::checkEmpAvailability)
        getEmpSalary("ahmed", ::checkEmpAvailability)
        reportOfEmp()

    }
    
}









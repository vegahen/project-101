package no.acntech.project101.web.employee.resources;

import java.util.List;
import java.util.Optional;

import no.acntech.project101.employee.Employee;
import no.acntech.project101.employee.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@CrossOrigin(origins = "http://localhost:3000")
//TODO This is a REST controler and should receive request on path employees
@RestController
@RequestMapping("employees")
public class EmployeeResource {

    //TODO The constructor needs to accept the required dependencies and assign them to class variables
    private final EmployeeService employeeService;

    public EmployeeResource(
            EmployeeService employeeService
    ) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDto>> findAll() {

        //TODO create a GET endpoint find all employees in the database and return them
        return ResponseEntity.ok(employees)
        return null;
    }

    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> findById(@PathVariable long id) {
        Optional<Employee> employee = employeeService.findById(id);
        // TODO create a GET endpoint that fetches a spesific employee based on its ID
        final var person = new EmployeeDto(1L, "Ørjan", "Johansen", LocalDate.of(1985, 1, 5), 1337);
        return responseEntity.ok(person);
    }

    @postmapping
    public ResponseEntity createEmployee(@RequestBody EmployeeDto employeeDto) {

        long id = 1337;

        ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(id)
                .toUri();

        //TODO Create a POST endpoint that accepts an employeeDTO and saves it in the database

        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteEmployee(@PathVariable Long id) {
        // TODO Create a DELETE endpoint that deletes a specific employee
        return ResponseEntity.accepted().build();
    }

    @PutMapping("{id}")
    public ResponseEntity updateEmployee(@PathVariable Long id, @RequestBody EmployeeDto employeeDto) {
        //TODO Create a PATCH endpoint that updates an employee with new values
        return ResponseEntity.ok().build();
    }
}

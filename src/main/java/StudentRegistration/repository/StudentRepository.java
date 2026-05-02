package StudentRegistration.repository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import StudentRegistration.entity.Student;

	public interface StudentRepository extends JpaRepository<Student, Integer> {

	}



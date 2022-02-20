package ssvv.LabPrjV1.repository;

import ssvv.LabPrjV1.domain.Student;
import ssvv.LabPrjV1.validation.*;

public class StudentRepository extends AbstractCRUDRepository<String, Student> {
    public StudentRepository(Validator<Student> validator) {
        super(validator);
    }
}


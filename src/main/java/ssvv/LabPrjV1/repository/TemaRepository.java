package ssvv.LabPrjV1.repository;

import ssvv.LabPrjV1.domain.Tema;
import ssvv.LabPrjV1.validation.*;

public class TemaRepository extends AbstractCRUDRepository<String, Tema> {
    public TemaRepository(Validator<Tema> validator) {
        super(validator);
    }
}


package ssvv.LabPrjV1.repository;

import ssvv.LabPrjV1.domain.*;
import ssvv.LabPrjV1.validation.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class NotaRepository extends AbstractCRUDRepository<Pair<String, String>, Nota> {
    public NotaRepository(Validator<Nota> validator) {
        super(validator);
    }
}

package ru.neoflex.practice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.neoflex.practice.model.Result;

public interface CalculationRepository extends JpaRepository<Result, Long> {
}



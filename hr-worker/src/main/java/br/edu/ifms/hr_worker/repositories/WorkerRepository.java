package br.edu.ifms.hr_worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifms.hr_worker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
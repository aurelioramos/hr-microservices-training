package br.edu.ifms.hr_worker.resources;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.hr_worker.entities.Worker;
import br.edu.ifms.hr_worker.repositories.WorkerRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

    private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);

    @Value("${test.config}")
    private String testConfig;

    private WorkerRepository repository;

    public WorkerResource(WorkerRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> workers = repository.findAll();
        return ResponseEntity.ok(workers);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        Optional<Worker> worker = repository.findById(id);

        if (worker.isPresent()) {
            logger.info("Returning workerId={}", worker.get().getId());
            return ResponseEntity.ok(worker.get());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping(value = "/configs")
    public ResponseEntity<String> getConfigs() {
        logger.info("CONFIG={}", testConfig);
        return ResponseEntity.ok(testConfig);
    }
}
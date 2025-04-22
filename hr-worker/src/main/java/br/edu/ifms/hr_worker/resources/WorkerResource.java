package br.edu.ifms.hr_worker.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.hr_worker.entities.Worker;
import br.edu.ifms.hr_worker.repositories.WorkerRepository;
import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

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
            return ResponseEntity.ok(worker.get());
        }
        return ResponseEntity.notFound().build();
    }
}
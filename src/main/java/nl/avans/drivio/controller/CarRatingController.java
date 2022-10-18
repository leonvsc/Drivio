package nl.avans.drivio.controller;

import nl.avans.drivio.model.CarRating;
import nl.avans.drivio.model.CarRatingId;
import nl.avans.drivio.repository.ICarRatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/rating")
public class CarRatingController {

    private final ICarRatingRepository carRatingRepository;

    @Autowired
    public CarRatingController(ICarRatingRepository carRatingRepository) {
        this.carRatingRepository = carRatingRepository;
    }

    @GetMapping(path = "/ratings")
    public List<CarRating> getAllRatings() {
        return carRatingRepository.findAll();
    }

    @PostMapping(path = "/add")
    public void add(@RequestBody CarRating carRating) {
        carRatingRepository.save(carRating);
    }

    @DeleteMapping(path = "/delete")
    public void delete(@RequestBody CarRating carRating) {
        carRatingRepository.delete(carRating);
    }
}


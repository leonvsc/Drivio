package nl.avans.drivio.controller;

import nl.avans.drivio.model.Advertisement;
import nl.avans.drivio.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/advertisement")
public class AdvertisementController {

    private final AdvertisementService AdvertisementService;

    @Autowired
    public AdvertisementController(AdvertisementService advertisementService) {
        AdvertisementService = advertisementService;
    }

    @GetMapping
    public List<Advertisement> getAdvertisements() {
        return AdvertisementService.getAdvertisements();
    }

    @GetMapping(path = "{advertisementId}")
    public Optional<Advertisement> getAdvertisementById(@PathVariable("advertisementId") int advertisementId) {
        return AdvertisementService.getAdvertisementById(advertisementId);
    }

    @PostMapping
    public void createAdvertisement(@RequestBody Advertisement advertisement) {
        AdvertisementService.createAdvertisement(advertisement);
    }

    @PutMapping(path = "/update")
    public void updateAdvertisement(@RequestBody Advertisement advertisement) {
        AdvertisementService.updateAdvertisement(advertisement);
    }

    @DeleteMapping(path = "/delete/{advertisementId}")
    public void deleteAdvertisement(@PathVariable("advertisementId") int advertisementId) {
        AdvertisementService.deleteAdvertisement(advertisementId);
    }
}

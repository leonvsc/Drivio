package nl.avans.drivio.controller;

import nl.avans.drivio.model.Advertisement;
import nl.avans.drivio.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/advertisement")
public class AdvertisementController {

    private final AdvertisementService AdvertisementService;

    @Autowired
    public AdvertisementController(AdvertisementService advertisementService) {
        AdvertisementService = advertisementService;
    }

    @GetMapping
    public List<Advertisement> getAdvertisements () {
        return AdvertisementService.getAdvertisements();
    }
}

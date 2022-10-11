package nl.avans.drivio.service;

import nl.avans.drivio.model.Advertisement;
import nl.avans.drivio.repository.AdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertisementService {

    private final AdvertisementRepository AdvertisementRepository;

    @Autowired
    public AdvertisementService(AdvertisementRepository advertisementRepository) {
        AdvertisementRepository = advertisementRepository;
    }

    public List<Advertisement> getAdvertisements() {
        return AdvertisementRepository.findAll();
    }
}

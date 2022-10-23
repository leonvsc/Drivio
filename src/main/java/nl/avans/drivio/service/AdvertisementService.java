package nl.avans.drivio.service;

import nl.avans.drivio.model.Advertisement;
import nl.avans.drivio.repository.IAdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdvertisementService {

    private final IAdvertisementRepository AdvertisementRepository;

    @Autowired
    public AdvertisementService(IAdvertisementRepository advertisementRepository) {
        AdvertisementRepository = advertisementRepository;
    }

    public List<Advertisement> getAdvertisements() {
        return AdvertisementRepository.findAll();
    }

    public Optional<Advertisement> getAdvertisementById(int advertisementId) {
        return AdvertisementRepository.findById(advertisementId);
    }

    public void createAdvertisement(Advertisement advertisement) {
        AdvertisementRepository.save(advertisement);
    }

    public void updateAdvertisement(Advertisement advertisement) {
        AdvertisementRepository.save(advertisement);
    }

    public void deleteAdvertisement(int advertisementId) {
        boolean exists = AdvertisementRepository.existsById(advertisementId);
        if (!exists) {
            throw new IllegalStateException("Advertisement with id " + advertisementId + " doesn't exists");
        }
        AdvertisementRepository.deleteById(advertisementId);
    }
}

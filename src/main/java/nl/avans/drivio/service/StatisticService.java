package nl.avans.drivio.service;

import nl.avans.drivio.model.Statistic;
import nl.avans.drivio.repository.StatisticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatisticService {

    private final StatisticRepository StatisticRepository;


    @Autowired
    public StatisticService(StatisticRepository statisticRepository) {
        StatisticRepository = statisticRepository;
    }

    public List<Statistic> getStatistics() {
        return StatisticRepository.findAll();
    }

    public Optional<Statistic> getStatisticById(int statisticId) {
        return StatisticRepository.findById(statisticId);
    }

    public void createStatistic(Statistic statistic) {
        StatisticRepository.save(statistic);
    }

    public void updateStatistic(Statistic statistic) {
        StatisticRepository.save(statistic);
    }

    public void deleteStatistic(int statisticId) {
        boolean exists = StatisticRepository.existsById(statisticId);
        if (!exists) {
            throw new IllegalStateException("Statistic with id " + statisticId + " doesn't exists");
        }
        StatisticRepository.deleteById(statisticId);
    }
}

package nl.avans.drivio.controller;

import nl.avans.drivio.model.Statistic;
import nl.avans.drivio.service.StatisticService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/statistic")
public class StatisticController {

    private final StatisticService StatisticService;

    public StatisticController(StatisticService statisticService) {
        StatisticService = statisticService;
    }

    @GetMapping
    public List<Statistic> getStatistics() {
        return StatisticService.getStatistics();
    }

    @GetMapping(path = "{statisticId}")
    public Optional<Statistic> getStatisticById(@PathVariable("statisticId") int statisticId) {
        return StatisticService.getStatisticById(statisticId);
    }

    @PostMapping
    public void createStatistic(@RequestBody Statistic statistic) {
        StatisticService.createStatistic(statistic);
    }

    @PutMapping(path = "/update")
    public void updateStatistic(@RequestBody Statistic statistic) {
        StatisticService.updateStatistic(statistic);
    }

    @DeleteMapping(path = "/delete/{statisticId}")
    public void deleteStatistic(@PathVariable("statisticId") int statisticId) {
        StatisticService.deleteStatistic(statisticId);
    }
}

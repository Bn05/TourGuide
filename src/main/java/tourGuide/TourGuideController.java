package tourGuide;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

import gpsUtil.location.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jsoniter.output.JsonStream;

import gpsUtil.location.VisitedLocation;
import tourGuide.model.dto.AttractionUserDistanceDTO;
import tourGuide.service.TourGuideService;
import tourGuide.model.User;
import tourGuide.model.UserPreferences;
import tripPricer.Provider;

@RestController
public class TourGuideController {

    @Autowired
    TourGuideService tourGuideService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from TourGuide!";
    }

    @RequestMapping("/getLocation")
    public String getLocation(@RequestParam String userName) {
        VisitedLocation visitedLocation = tourGuideService.getUserLocation(getUser(userName));
        return JsonStream.serialize(visitedLocation.location);
    }

    @RequestMapping("/getNearbyAttractions")
    public String getNearbyAttractions(@RequestParam String userName) {
        User user = getUser(userName);
        List<AttractionUserDistanceDTO> nearByAttractions = tourGuideService.getNearByAttractions(user);
        return JsonStream.serialize(nearByAttractions);
    }

    @RequestMapping("/getRewards")
    public String getRewards(@RequestParam String userName) {
        return JsonStream.serialize(tourGuideService.getUserRewards(getUser(userName)));
    }

    @RequestMapping("/getAllCurrentLocations")
    public String getAllCurrentLocations() {

        Map<UUID, Location> allCurrentLocations = tourGuideService.getAllCurrentLocations();

        return JsonStream.serialize(allCurrentLocations);
    }

    @RequestMapping("/getTripDeals")
    public String getTripDeals(@RequestParam String userName) {
        List<Provider> providers = tourGuideService.getTripDeals(getUser(userName));
        return JsonStream.serialize(providers);
    }

    @PutMapping("/updateUserPreferences")
    public void updateUserPreferences(@RequestParam("userNAme") String userName,
                                      @RequestBody UserPreferences userPreferences) {
        tourGuideService.updateUserPreferences(userName, userPreferences);

    }

    private User getUser(String userName) {
        return tourGuideService.getUser(userName);
    }


}
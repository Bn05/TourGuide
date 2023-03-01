package tourGuide.model.dto;

public class AttractionUserDistanceDTO {

    private String attractionName;
    private double attractionLongitude;
    private double attractionLatitude;
    private double userLongitude;
    private double userLatitude;
    private double distanceBetweenUserAttraction;
    private int rewardPoint;

    public AttractionUserDistanceDTO(String attractionName, double attractionLongitude, double attractionLatitude, double userLongitude, double userLatitude, double distanceBetweenUserAttraction, int rewardPoint) {
        this.attractionName = attractionName;
        this.attractionLongitude = attractionLongitude;
        this.attractionLatitude = attractionLatitude;
        this.userLongitude = userLongitude;
        this.userLatitude = userLatitude;
        this.distanceBetweenUserAttraction = distanceBetweenUserAttraction;
        this.rewardPoint = rewardPoint;
    }

    public String getAttractionName() {
        return attractionName;
    }

    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }

    public double getAttractionLongitude() {
        return attractionLongitude;
    }

    public void setAttractionLongitude(double attractionLongitude) {
        this.attractionLongitude = attractionLongitude;
    }

    public double getAttractionLatitude() {
        return attractionLatitude;
    }

    public void setAttractionLatitude(double attractionLatitude) {
        this.attractionLatitude = attractionLatitude;
    }

    public double getUserLongitude() {
        return userLongitude;
    }

    public void setUserLongitude(double userLongitude) {
        this.userLongitude = userLongitude;
    }

    public double getUserLatitude() {
        return userLatitude;
    }

    public void setUserLatitude(double userLatitude) {
        this.userLatitude = userLatitude;
    }

    public double getDistanceBetweenUserAttraction() {
        return distanceBetweenUserAttraction;
    }

    public void setDistanceBetweenUserAttraction(double distanceBetweenUserAttraction) {
        this.distanceBetweenUserAttraction = distanceBetweenUserAttraction;
    }

    public int getRewardPoint() {
        return rewardPoint;
    }

    public void setRewardPoint(int rewardPoint) {
        this.rewardPoint = rewardPoint;
    }
}

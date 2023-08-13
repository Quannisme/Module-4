package code.vn.modell;

import java.util.List;

public class Medical {
    private String id;
    private String fullName;
    private String yearOfBirth;
    private List<String>general;
    private List<String>national;
    private String numberId;
    private List<String>informationTransport;
    private String numberCar;
    private String numberChair;
    private DateOfDeparture star;
    private EndOfMonthYear end;
    private String destination;

    public Medical() {
    }

    public Medical(String id,String fullName, String yearOfBirth, String numberId, String numberCar, String numberChair, DateOfDeparture star, EndOfMonthYear end, String destination) {
        this.id=id;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.numberId = numberId;
        this.numberCar = numberCar;
        this.numberChair = numberChair;
        this.star = star;
        this.end = end;
        this.destination = destination;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public List<String> getGeneral() {
        return general;
    }

    public void setGeneral(List<String> general) {
        this.general = general;
    }

    public List<String> getNational() {
        return national;
    }

    public void setNational(List<String> national) {
        this.national = national;
    }

    public String getNumberId() {
        return numberId;
    }

    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    public List<String> getInformationTransport() {
        return informationTransport;
    }

    public void setInformationTransport(List<String> informationTransport) {
        this.informationTransport = informationTransport;
    }

    public String getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(String numberCar) {
        this.numberCar = numberCar;
    }

    public String getNumberChair() {
        return numberChair;
    }

    public void setNumberChair(String numberChair) {
        this.numberChair = numberChair;
    }

    public DateOfDeparture getStar() {
        return star;
    }

    public void setStar(DateOfDeparture star) {
        this.star = star;
    }

    public EndOfMonthYear getEnd() {
        return end;
    }

    public void setEnd(EndOfMonthYear end) {
        this.end = end;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}

public class Parsinator {

    private String platformConfigurationsPath;

    /**
     * Default parsinator constructor.
     * 
     * 
     */
    public Parsinator() {
        this.platformConfigurationsPath = "./platforms.xml";
    }

    /**
     * 
     */
    public String getPlatformConfigurationsPath() {
        return this.plaformConfigurationsPath;
    }

    public void setPlatformConfigurationPath(String path) {
        this.platformConfigurationPath = path.toString();
    }

    @Override
    public String toString() {
        return "This is the parsinator; set to parse " + getPlatformConfigruationsPath();
    }
}

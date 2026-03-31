public class Policy {
    private String policyNumber;
    private String clientName;
    private double basePremium;
    private int riskLevel;
    private double vehicleValue;
    private boolean hasAlarm;
    private boolean claimFreeClient;

    private static int createdPolicyCount = 0;
    private static final double ADMINISTRATIVE_FEE = 100;

    public Policy(String policyNumber, String clientName, double basePremium, int riskLevel, double vehicleValue, boolean hasAlarm, boolean claimFreeClient) {
        this.policyNumber = policyNumber;
        this.clientName = clientName;
        this.basePremium = basePremium;
        this.riskLevel = riskLevel;
        this.vehicleValue = vehicleValue;
        this.hasAlarm = hasAlarm;
        this.claimFreeClient = claimFreeClient;

        createdPolicyCount++;
    }


    public String getRiskSummary() {
        return switch (riskLevel) {
            case 1 -> "LOW";
            case 2 -> "MEDIUM";
            case 3 -> "HIGH";
            default -> "UNKNOWN";
        };
    }


    public String getPolicyNumber() {
        return policyNumber;
    }

    public double getBasePremium() {
        return basePremium;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Policy)) return false;

        Policy other = (Policy) obj;
        return this.policyNumber.equals(other.policyNumber);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", clientName='" + clientName + '\'' +
                ", basePremium=" + basePremium +
                ", riskLevel=" + riskLevel +
                ", vehicleValue=" + vehicleValue +
                ", hasAlarm=" + hasAlarm +
                ", claimFreeClient=" + claimFreeClient +
                '}';
    }
}

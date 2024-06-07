class SolutionInBuilt {
    public String defangIPaddr(String address) {
        String validIP = address.replace(".","[.]");
        return validIP;
    }
}

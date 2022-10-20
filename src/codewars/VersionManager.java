package codewars;

import java.util.*;

public class VersionManager {
    private Version currentVersion;
    private List<Version> previousVersions = new ArrayList<>();

    public VersionManager() {
        currentVersion = new Version();
    }

    public VersionManager(String version) {
        currentVersion = new Version(version);
    }

    public VersionManager major() {
        previousVersions.add(currentVersion);
        Version version = new Version(currentVersion.getMajor() + 1, 0, 0);
        currentVersion = version;
        return this;
    }

    public VersionManager minor() {
        previousVersions.add(currentVersion);
        Version version = new Version(currentVersion.getMajor(), currentVersion.getMinor() + 1, 0);
        currentVersion = version;
        return this;
    }

    public VersionManager patch() {
        previousVersions.add(currentVersion);
        Version version = new Version(currentVersion.getMajor(), currentVersion.getMinor(), currentVersion.getPatch() + 1);
        currentVersion = version;
        return this;
    }

    public VersionManager rollback() {
        try {
            currentVersion = previousVersions.get(previousVersions.size() - 1);
            previousVersions.remove(previousVersions.size() - 1);
            return this;
        }
        catch(IndexOutOfBoundsException e) {
            throw new NoSuchElementException("Cannot rollback!");
        }
    }

    public String release() {
        return currentVersion.toString();
    }
}

class Version {
    private int major;
    private int minor;
    private int patch;
    public static final int DEFAULT_PATCH = 1;

    public Version() {
        major = 0;
        minor = 0;
        patch = DEFAULT_PATCH;
    }

    public Version(int major, int minor, int patch) {
        this.major = major;
        this.minor = minor;
        this.patch = patch;
    }

    public Version(String version) {
        if(version.equals("")) {
            patch = DEFAULT_PATCH;
            return;
        }
        String[] versionArray = version.split("\\.");
        try {
            switch (versionArray.length) {
                case 0: {
                    patch = DEFAULT_PATCH;
                    break;
                }
                case 1: {
                    major = Integer.parseInt(versionArray[0]);
                    break;
                }
                case 2: {
                    major = Integer.parseInt(versionArray[0]);
                    minor = Integer.parseInt(versionArray[1]);
                    break;
                }
                default: {
                    major = Integer.parseInt(versionArray[0]);
                    minor = Integer.parseInt(versionArray[1]);
                    patch = Integer.parseInt(versionArray[2]);
                }
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException("Error occured while parsing version!");
        }
    }

    public int getMajor() {
        return major;
    }

    public void setMajor(int major) {
        this.major = major;
    }

    public int getMinor() {
        return minor;
    }

    public void setMinor(int minor) {
        this.minor = minor;
    }

    public int getPatch() {
        return patch;
    }

    public void setPatch(int patch) {
        this.patch = patch;
    }

    @Override
    public String toString() {
        return major + "." +
                minor + "." +
                patch;
    }

    public static void main(String[] args) {
        try {
            Version version = null;
            // version = new Version();
            // version = new Version("1.2.3");
            // version = new Version("1.2.3.4");
            // version = new Version("1.2.3.d");
            // version = new Version("1");
            // version = new Version("1.1");
            // version = new Version(1, 2, 3);
            // version = new Version("a.b.c");
            // version = new Version("");

            System.out.println(version.getMajor());
            System.out.println(version.getMinor());
            System.out.println(version.getPatch());
            System.out.println(version);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


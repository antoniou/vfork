
// Copyright 2008 2009 Douglas Wikstrom

// This file is part of Verificatum Source Code (Verificatum).

// Verificatum is NOT free software. You should have received a copy
// of the Source Code For Internal Review License Agreement along with
// Verificatum. If not, see <http://www.verificatum.com/license/>.

// Verificatum is distributed in the hope that it will be useful, but
// WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// Source Code For Internal Review License Agreement for more details.

package verificatum;

/**
 * Programmatic access to the version of this package.
 *
 * @author Douglas Wikstrom
 */
public class Version {

    /**
     * Package version string of this package.
     */
    public static final String packageVersion = "1.0.7";

    /**
     * Returns the major version number as an integer.
     *
     * @return Major version number
     */
    public static int major(String packageVersion) {
        return Integer.valueOf(packageVersion.split(",")[0]);
    }

    /**
     * Returns the minor version number as an integer.
     *
     * @return Minor version number
     */
    public static int minor(String packageVersion) {
        return Integer.valueOf(packageVersion.split(",")[1]);
    }

    /**
     * Returns the revision version number as an integer.
     *
     * @return Revision version number
     */
    public static int revision(String packageVersion) {
        return Integer.valueOf(packageVersion.split(",")[2]);
    }
}
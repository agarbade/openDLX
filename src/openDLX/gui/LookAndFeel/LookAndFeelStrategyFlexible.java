/*******************************************************************************
 * openDLX - A DLX/MIPS processor simulator.
 * Copyright (C) 2013 The openDLX project, University of Augsburg, Germany
 * Project URL: <https://sourceforge.net/projects/opendlx>
 * Development branch: <https://github.com/smetzlaff/openDLX>
 *
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program, see <LICENSE>. If not, see
 * <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package openDLX.gui.LookAndFeel;

import javax.swing.UIManager;

public class LookAndFeelStrategyFlexible extends LookAndFeelStrategyMonoSpaced {

    private final String className;

    public LookAndFeelStrategyFlexible(String className) {
        super();
        this.className = className;
    }

    @Override
    public void setLookAndFeel()
    {
        //sets monospaced font in tables and editable components
        super.setLookAndFeel();
        try
        {   //sets the systems default LookAndFeel
            UIManager.setLookAndFeel(className);
        }
        catch (Exception e)
        {
            System.err.println("Failed to set look and feel '" + className + "'");
            e.printStackTrace();
        }
    }

}
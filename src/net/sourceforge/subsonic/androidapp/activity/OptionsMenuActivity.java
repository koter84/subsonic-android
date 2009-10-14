/*
 This file is part of Subsonic.

 Subsonic is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 Subsonic is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with Subsonic.  If not, see <http://www.gnu.org/licenses/>.

 Copyright 2009 (C) Sindre Mehus
 */
package net.sourceforge.subsonic.androidapp.activity;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import net.sourceforge.subsonic.androidapp.R;

/**
 * @author Sindre Mehus
 */
public class OptionsMenuActivity extends Activity {
    private static final int MENU_HOME = 1;
    private static final int MENU_STREAM_QUEUE = 2;
    private static final int MENU_DOWNLOAD_QUEUE = 3;
    private static final int MENU_SETTINGS = 4;
    private static final int MENU_HELP = 5;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, MENU_HOME, 0, "Subsonic Home").setIcon(R.drawable.menu_home);
        menu.add(0, MENU_STREAM_QUEUE, 0, "Now playing").setIcon(R.drawable.stream_queue);
        menu.add(0, MENU_DOWNLOAD_QUEUE, 0, "Now downloading").setIcon(R.drawable.download_queue);
        menu.add(0, MENU_SETTINGS, 0, "Settings").setIcon(R.drawable.settings);
        menu.add(0, MENU_HELP, 0, "Help").setIcon(R.drawable.help);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_HOME:
                // TODO: use FLAG_ACTIVITY_CLEAR_TOP
                startActivity(new Intent(this, MainActivity.class));
                return true;
            case MENU_DOWNLOAD_QUEUE:
                startActivity(new Intent(this, DownloadQueueActivity.class));
                return true;
            case MENU_STREAM_QUEUE:
                startActivity(new Intent(this, StreamQueueActivity.class));
                return true;
            case MENU_SETTINGS:
                startActivity(new Intent(this, SettingsActivity.class));
                return true;
            case MENU_HELP:
                startActivity(new Intent(this, HelpActivity.class));
                return true;
        }
        return false;
    }
}

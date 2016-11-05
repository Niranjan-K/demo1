package org.wso2.nira.demo1.pilots;
/*
 *  Copyright (c) 2016, WSO2 Inc. All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

import java.util.ArrayList;

public class Entries {

    private ArrayList<Entry> Entries;

    public ArrayList<Entry> getEntries() {
        return Entries;
    }

    public void setEntries(ArrayList<Entry> entries) {
        Entries = entries;
    }

    /**
     * Adds to the Entry if the flight_hours is minimum and below the defined hours
     *
     * @param entry Entry to be added to the Arraylist
     * @param hours Value used in the filter critera
     * @return
     */
    public boolean isAboveRange(Entry entry, int hours) {
        if (Entries == null) {
            Entries = new ArrayList<>();
        }
        if (Entries.size() != 0 && Entries.get(0).getFlight_hours() > entry.getFlight_hours()) {
            Entries.remove(0);
            Entries.add(entry);
            return false;
        } else if (Entries.size() == 0 && entry.getFlight_hours() < hours) {
            Entries.add(entry);
            return false;
        }
        return true;
    }
}

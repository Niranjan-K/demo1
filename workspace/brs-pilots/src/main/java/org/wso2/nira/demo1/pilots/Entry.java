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


public class Entry implements Comparable {

    private int id;
    private String name;
    private int flight_hours;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlight_hours() {
        return flight_hours;
    }

    public void setFlight_hours(int flight_hours) {
        this.flight_hours = flight_hours;
    }

    public int compareTo(Object compareEntry) {

        int compareFlightHours = ((Entry) compareEntry).getFlight_hours();
        return this.flight_hours-compareFlightHours;
    }
}

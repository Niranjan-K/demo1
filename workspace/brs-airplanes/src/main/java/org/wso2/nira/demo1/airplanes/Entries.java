package org.wso2.nira.demo1.airplanes;
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
import java.util.List;

public class Entries {

    private List<Entry> airlines;

    public List<Entry> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<Entry> airlines) {
        this.airlines = airlines;
    }

    public Entry getAirline(final int sector) {

        if (this.getAirlines() != null && this.getAirlines().size() > 0) {
            return this.getAirlines().stream().filter(e -> e.getSector() == sector)
                    .findFirst()
                    .get();
        }
        return null;
    }
}

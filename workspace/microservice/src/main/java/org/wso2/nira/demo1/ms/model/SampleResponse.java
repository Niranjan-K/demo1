package org.wso2.nira.demo1.ms.model;
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

public class SampleResponse {

    private String msg;
    private String code;

    public SampleResponse(boolean airline, boolean pilot) {

        if (airline && pilot) {
            this.msg = "Pilot assigned to flight!";
        } else if (!airline) {
            this.msg = "No available flights";
        } else {
            this.msg = "No available pilot";
        }
        this.code = "200";
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

/*
 * Copyright 2019 The FATE Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webank.ai.fate.core.result;

import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ReturnResult{
    private static final Logger LOGGER = LogManager.getLogger();
    private int retcode;
    private String retmsg = "";
    private Map<String, Object> data;

    public ReturnResult(){
        this.data = new HashMap<>();
    }

    public void setRetcode(int retcode) {
        this.retcode = retcode;
    }

    public int getRetcode() {
        return retcode;
    }

    public void setRetmsg(String retmsg) {
        this.retmsg = retmsg;
    }

    public String getRetmsg() {
        return retmsg;
    }

    public void setData(String name, String value) {
        this.data.put(name, value);
    }

    public void putAllData(Map<String, Object> map){
        this.data.putAll(map);
    }

    public Map<String, Object> getData() {
        return data;
    }

}

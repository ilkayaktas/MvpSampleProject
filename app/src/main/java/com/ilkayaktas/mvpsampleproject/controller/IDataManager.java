/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.ilkayaktas.mvpsampleproject.controller;


import com.ilkayaktas.mvpsampleproject.controller.api.IApiHelper;
import com.ilkayaktas.mvpsampleproject.controller.db.IDbHelper;
import com.ilkayaktas.mvpsampleproject.controller.pref.IPreferenceHelper;
import com.ilkayaktas.mvpsampleproject.model.app.SorularAppModel;
import io.reactivex.Observable;

/**
 * Created by iaktas on 27/01/17.
 */

public interface IDataManager extends IDbHelper, IPreferenceHelper, IApiHelper {

    Observable<SorularAppModel> getQuestions();

}
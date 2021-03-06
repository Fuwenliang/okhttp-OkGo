/*
 * Copyright 2016 jeasonlzy(廖子尧)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lzy.demo.okdownload;

import android.content.Intent;

import com.lzy.demo.base.MainFragment;
import com.lzy.demo.model.ItemModel;

import java.util.List;

/**
 * ================================================
 * 作    者：jeasonlzy（廖子尧）Github地址：https://github.com/jeasonlzy
 * 版    本：1.0
 * 创建日期：2017/6/9
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class OkDownloadFragment extends MainFragment {

    @Override
    public void fillData(List<ItemModel> items) {
        items.add(new ItemModel("开始下载",//
                                "1. 这个属于OkServer依赖中的功能,并不属于OkGo\n" +//
                                "2. 支持断点下载和状态管理\n" +//
                                "3. 支持自定义下载任务优先级\n" +//
                                "4. 支持链试调用\n" +//
                                "5. 最多支持扩展3个额外数据\n" +//
                                "6. 支持同时指定多个下载目录"));

        items.add(new ItemModel("所有任务",//
                                "1. 每个任务支持暂停，继续，重新下载，删除等操作\n" +//
                                "2. 支持全部暂停，全部开始，全部删除\n" +//
                                "3. 支持全局下载任务监听\n" +//
                                "4. 支持一个任务多个监听\n" +//
                                "5. 支持按下载中列表和下载完成列表筛选"));

        items.add(new ItemModel("下载中任务",//
                                "1. 每个任务支持暂停，继续，重新下载，删除等操作\n" +//
                                "2. 支持全部暂停，全部开始，全部删除\n" +//
                                "3. 支持全局下载任务监听\n" +//
                                "4. 支持一个任务多个监听\n" +//
                                "5. 支持按下载中列表和下载完成列表筛选"));

        items.add(new ItemModel("已完成任务",//
                                "1. 每个任务支持暂停，继续，重新下载，删除等操作\n" +//
                                "2. 支持全部暂停，全部开始，全部删除\n" +//
                                "3. 支持全局下载任务监听\n" +//
                                "4. 支持一个任务多个监听\n" +//
                                "5. 支持按下载中列表和下载完成列表筛选"));

    }

    @Override
    public void onItemClick(int position) {
        if (position == 0) startActivity(new Intent(context, DownloadListActivity.class));
        if (position == 1) startActivity(new Intent(context, DownloadAllActivity.class));
        if (position == 2) startActivity(new Intent(context, DownloadingActivity.class));
        if (position == 3) startActivity(new Intent(context, DownloadFinishActivity.class));
    }
}

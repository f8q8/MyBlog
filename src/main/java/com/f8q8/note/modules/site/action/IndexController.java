package com.f8q8.note.modules.site.action;

import com.f8q8.note.base.utils.Result;
import com.f8q8.note.base.utils.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    public Result index() {
        return ResultUtils.success();
    }
}

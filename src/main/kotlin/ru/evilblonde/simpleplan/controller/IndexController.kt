package ru.evilblonde.simpleplan.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class IndexController {

    @RequestMapping("/")
    fun index() = "index"

}

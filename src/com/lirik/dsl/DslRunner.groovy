package com.lirik.dsl

import static com.lirik.dsl.DslBuilder.*

//def email = new Email()
//email.setFrom("from@mail.ru")
//email.setTo("to@mail.ru")
//email.setTitle("title")
//
//def body = new EmailBody()
//body.setText("text")
//body.setImages(List.of("image.jpg"))
//
//email.setBody(body)

mail {
    from "from@mail.ru"
    to "to@mail.ru"
    title "title"
    body {
        text "text of the letter"
        images(['firstImage.jpg', 'secondImage.png'])
        image('thirdImage.jpeg')
    }
}
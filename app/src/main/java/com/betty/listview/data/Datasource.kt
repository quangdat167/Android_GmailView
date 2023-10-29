package com.betty.listview.data

import com.betty.listview.model.Mail

class Datasource {
    fun loadMails(): List<Mail> {
        return listOf(
            Mail("Reply to this email directly, view it on GitHub, or unsubscribe.\n" +
                    "You are receiving this because you authored the thread.", "12:00 AM", "notifications@github.com"),
            Mail(
                "SAMSUNG SRV là nơi ươm mầm và phát triển tài năng Việt cho các bạn sinh viên có đam mê về Khoa học Công nghệ. Để khích lệ tinh thần và giúp các bạn sinh viên có cơ hội trải nghiệm ở một môi trường doanh nghiệp năng động, hiện đại, Trung tâm Nghiên cứu và Phát triển Samsung Việt Nam (SRV) giới thiệu tới bạn chương trình Học bổng tài năng STP Đợt 2 2023 dành cho các bạn sinh viên tốt nghiệp 06/2024 hoặc 12/2024.",
                "08:20 PM",
                "hlong.ng@samsung.com"
            ),
            Mail("Abcdshfsd sdfhsad", "09:00 AM", "abc@gmail.com"),
            Mail("Cảm ơn Quý khách đã sử dụng dịch vụ MB eBanking.\n" +
                    "MB xin thông báo giao dịch của Quý khách đã được thực hiện như sau:", "05:00 PM", "mbebanking@mbbank.com.vn"),
            Mail("Hello", "02:00 PM", "ahsdf@irr.com"),
            Mail("Interview result", "01:00 PM", "recruitment@abc.com"),
            Mail("\n" +
                    "Xin chào datvg,\n" +
                    " \n" +
                    "Đơn hàng #231009E0WC847B của bạn đã được giao thành công ngày 13/10/2023.\n", "10:00 AM", "info@mail.shopee.vn"),
            Mail("\n" +
                    "Xin chào datvg,\n" +
                    " \n" +
                    "Đơn hàng #231009E0WC847B của bạn đã được giao thành công ngày 13/10/2023.\n", "10:00 AM", "info@mail.shopee.vn"),
            Mail("\n" +
                    "Xin chào datvg,\n" +
                    " \n" +
                    "Đơn hàng #231009E0WC847B của bạn đã được giao thành công ngày 13/10/2023.\n", "10:00 AM", "info@mail.shopee.vn"),
        )
    }
}
package com.example.shoppingscanner

sealed class Screen (val route:String){
    object DontWaitScreen: Screen(route = "dont_wait_screen")
    object ContinueWithBarcodeScreen: Screen(route = "continue_with_barcode_screen")
    object CartScreen: Screen(route = "cart_screen")
    object BarcodeScannerScreen: Screen(route = "barcode_scanner_screen")
    object PaymentCompletedScreen: Screen(route = "payment_completed_screen")
}

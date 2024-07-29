package org.qachallenge.data;

import org.testng.annotations.DataProvider;

public class ProductOrderData {

    @DataProvider(name = "newProductOK")
    public Object[][] provideNewProductOKData() {
        return new Object[][] {
                {1, "Producto1", 100},
                {2, "Sweet product", 33},
                {321654987, "Big product", 62},
                {5, "Product 3232", 15},
                {6, "Product +/<*-*>", 21},
                {7, "a", 20},
                {8, "This product has a really long name", 150},
                {14, "Cute product", 8}
        };
    }

    @DataProvider(name = "newOrderOK")
    public static Object[][] provideNewOrderOKData() {
        return new Object[][]{
                {1, "Green product", 10, "OK"},
                {4, "Blue product", 3, "OK"},
                {1230004512, "Blue product", 20, "OK"},
                {13, "Green product", 9, "OK"},
                {18, "Pink product", 14, "32"},
                {19, "Pink product", 4, "+-/*"},
                {20, "Pink product", 2, "b"},
                {21, "Pink product", 2, "STATUS OKs"}
        };
    }

    @DataProvider(name = "newProductStatus400")
    public Object[][] provideNewProduct400Data() {
        return new Object[][] {
                {1, "Green product", 12},
                {5.5, "Float product", 50},
                {-9, "Negative product", 32},
                {3, "", 0},
                {4, "", 11},
                {9, "Dark product", null},
                {10, "Black product", ""},
                {11, "White product", "one"},
                {12, "Symbol product", "$20+-*/"},
                {15, "Red product", -15},
                {"", "Pink product", 100},
                {"idhere", "Orange product", 20},
                {"+-*/", "Rare product", 5000},
                {"", "", ""}
        };
    }

    @DataProvider(name = "newOrderStatus400")
    public static Object[][] provideNewOrder400Data() {
        return new Object[][]{
                {1, "Pink product", 3, "OK"},
                {null, "Red product", 8, "OK"},
                {null, "Green product", 1, "OK"},
                {"one", "Green product", 6, "OK"},
                {"+-*/", "Green product", 5, "OK"},
                {5.3, "Violet product", 15, "OK"},
                {-5, "Orange product", 11, "OK"},
                {5, null, 2, "OK"},
                {6, "Green product", 3, null},
                {7, "Non existent product", 3, "OK"},
                {8, "Green product", null, "OK"},
                {9, "Green product", null, "OK"},
                {10, "Green product", "five", "OK"},
                {11, "Green product", "6+-/*", "OK"},
                {12, "Green product", 6.3, "OK"},
                {14, "Green product", -7, "OK"},
                {null, null, null, "OK"}
        };
    }

}

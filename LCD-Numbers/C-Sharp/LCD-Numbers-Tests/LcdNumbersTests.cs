using Microsoft.VisualStudio.TestTools.UnitTesting;
using LCDNumbers;
using System;

namespace LCD_Numbers_Tests
{
    [TestClass]
    public class LcdNumbersTests
    {
        public LcdNumbers System { get; set; }

        [TestInitialize]
        public void Setup()
        {
            System = new LcdNumbers();
        }

        // EXAMPLE: Test that the number "1" has the correct result
        [TestMethod]
        public void One()
        {
            var translatedOne = System.Translate(1);

            var expectedOne = "   \n  |\n  |";

            Assert.AreEqual(expectedOne, translatedOne);
        }
    }
}

using Microsoft.VisualStudio.TestTools.UnitTesting;
using Segment_Numbers;
using System;

namespace Segment_Numbers_Tests
{
    [TestClass]
    public class LcdNumbersTests
    {
        public SegmentNumbers System { get; set; }

        [TestInitialize]
        public void Setup()
        {
            System = new SegmentNumbers();
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

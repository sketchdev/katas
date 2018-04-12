package segment

import "testing"

func TestRender1(t *testing.T) {
	translatedOne := Render(1)

	expectedOne := "   \n  |\n  |"

	if translatedOne != expectedOne {
		t.Errorf("expected \"\n%s\"\n but found \"\n%s\"\n", expectedOne, translatedOne)
	}
}

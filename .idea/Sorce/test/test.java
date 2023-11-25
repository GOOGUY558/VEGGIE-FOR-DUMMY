@Test
void givenListOfStrings_whenUsingCollections_thenListIsSorted() {
        Collections.sort(INPUT_NAMES);
        assertThat(INPUT_NAMES).isEqualTo(EXPECTED_NATURAL_ORDER);
        }
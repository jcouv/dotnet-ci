// Given a header and text, add them to the status page
// as a list

def call (String header, Map urls) {
    def newSummary = manager.createSummary("terminal.gif")
    newSummary.appendText("<b>$header</b><ul>", false)
    if (${urls}.size() > 0) {
        ${urls}.each { linkDescription, linkToAdd ->
            newSummary.appendText("<li><a href=\\\"\$linkToAdd\\\">\$linkDescription</a></li>", false)
        }
    }
    newSummary.appendText("</ul>", false)
}
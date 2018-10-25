fetch('/greeting')
    .then(function(response) {
        return response.json()
    })
    .then(function(responseJson) {
        console.log('open browser console to see response:', responseJson)
    })

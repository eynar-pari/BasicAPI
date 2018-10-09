Feature: Create Project with POST request

  Background: common
    Given I have a connection with Todo.Ly

  @Regression @Acceptance
  Scenario: As client, I can send a POST request to create a project.

    Given I have a connection with Todo.Ly
    When I send a POST request to projects.json end point with the json
    """
    {
          "Content": "Eynar9999",
          "Icon": 1
    }
    """
    Then the response code should be 200
    And the response body should be equal to
    """
    {
      "Id": "IGNORE",
      "Content": "Eynar9999",
      "ItemsCount": 0,
      "Icon": 1,
      "ItemType": 2,
      "ParentId": null,
      "Collapsed": false,
      "ItemOrder": "IGNORE",
      "Children": [],
      "IsProjectShared": false,
      "ProjectShareOwnerName": null,
      "ProjectShareOwnerEmail": null,
      "IsShareApproved": false,
      "IsOwnProject": true,
      "LastSyncedDateTime": "IGNORE",
      "LastUpdatedDate": "IGNORE",
      "Deleted": false,
      "SyncClientCreationId": null
    }
    """
    And I get the value of attribute : Id in ID_PROJECT
    When I send a POST request to projects/ID_PROJECT.json end point with the json
    """
    {
          "Icon": 4
    }
    """
    Then the response code should be 200
    And the response body should be equal to
    """
    {
  "Id": ID_PROJECT,
  "Content": "Eynar9999",
  "ItemsCount": 0,
  "Icon": 4,
  "ItemType": 2,
  "ParentId": null,
  "Collapsed": false,
  "ItemOrder": "IGNORE",
  "Children": [],
  "IsProjectShared": false,
  "ProjectShareOwnerName": null,
  "ProjectShareOwnerEmail": null,
  "IsShareApproved": false,
  "IsOwnProject": true,
  "LastSyncedDateTime": "IGNORE",
  "LastUpdatedDate": "IGNORE",
  "Deleted": false,
  "SyncClientCreationId": null
}
    """











